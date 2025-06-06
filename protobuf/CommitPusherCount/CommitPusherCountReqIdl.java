package protobuf.CommitPusherCount;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class CommitPusherCountReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<CommitPusherCountReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(CommitPusherCountReqIdl commitPusherCountReqIdl) {
            super(commitPusherCountReqIdl);
            if (commitPusherCountReqIdl == null) {
                return;
            }
            this.data = commitPusherCountReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public CommitPusherCountReqIdl build(boolean z) {
            return new CommitPusherCountReqIdl(this, z);
        }
    }

    public CommitPusherCountReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}