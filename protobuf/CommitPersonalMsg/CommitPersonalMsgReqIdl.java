package protobuf.CommitPersonalMsg;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class CommitPersonalMsgReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<CommitPersonalMsgReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(CommitPersonalMsgReqIdl commitPersonalMsgReqIdl) {
            super(commitPersonalMsgReqIdl);
            if (commitPersonalMsgReqIdl == null) {
                return;
            }
            this.data = commitPersonalMsgReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public CommitPersonalMsgReqIdl build(boolean z) {
            return new CommitPersonalMsgReqIdl(this, z);
        }
    }

    public CommitPersonalMsgReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}