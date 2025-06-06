package protobuf.SendMenuMsg;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class SendMenuMsgReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<SendMenuMsgReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(SendMenuMsgReqIdl sendMenuMsgReqIdl) {
            super(sendMenuMsgReqIdl);
            if (sendMenuMsgReqIdl == null) {
                return;
            }
            this.data = sendMenuMsgReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public SendMenuMsgReqIdl build(boolean z) {
            return new SendMenuMsgReqIdl(this, z);
        }
    }

    public SendMenuMsgReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}