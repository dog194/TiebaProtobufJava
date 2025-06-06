package protobuf.DelGroupMsgs;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import protobuf.Error;

/* loaded from: classes4.dex */
public final class DelGroupMsgsResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<DelGroupMsgsResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(DelGroupMsgsResIdl delGroupMsgsResIdl) {
            super(delGroupMsgsResIdl);
            if (delGroupMsgsResIdl == null) {
                return;
            }
            this.error = delGroupMsgsResIdl.error;
            this.data = delGroupMsgsResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public DelGroupMsgsResIdl build(boolean z) {
            return new DelGroupMsgsResIdl(this, z);
        }
    }

    public DelGroupMsgsResIdl(Builder builder, boolean z) {
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