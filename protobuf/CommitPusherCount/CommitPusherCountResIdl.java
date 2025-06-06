package protobuf.CommitPusherCount;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import protobuf.Error;

/* loaded from: classes4.dex */
public final class CommitPusherCountResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<CommitPusherCountResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(CommitPusherCountResIdl commitPusherCountResIdl) {
            super(commitPusherCountResIdl);
            if (commitPusherCountResIdl == null) {
                return;
            }
            this.error = commitPusherCountResIdl.error;
            this.data = commitPusherCountResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public CommitPusherCountResIdl build(boolean z) {
            return new CommitPusherCountResIdl(this, z);
        }
    }

    public CommitPusherCountResIdl(Builder builder, boolean z) {
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