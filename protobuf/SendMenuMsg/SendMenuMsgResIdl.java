package protobuf.SendMenuMsg;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import protobuf.Error;

/* loaded from: classes4.dex */
public final class SendMenuMsgResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<SendMenuMsgResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(SendMenuMsgResIdl sendMenuMsgResIdl) {
            super(sendMenuMsgResIdl);
            if (sendMenuMsgResIdl == null) {
                return;
            }
            this.error = sendMenuMsgResIdl.error;
            this.data = sendMenuMsgResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public SendMenuMsgResIdl build(boolean z) {
            return new SendMenuMsgResIdl(this, z);
        }
    }

    public SendMenuMsgResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
        } else {
            this.error = builder.error;
            this.data = builder.data;
        }
    }
}