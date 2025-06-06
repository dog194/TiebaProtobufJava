package protobuf.PushMessage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import protobuf.Error;

/* loaded from: classes4.dex */
public final class PushMessageResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<PushMessageResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(PushMessageResIdl pushMessageResIdl) {
            super(pushMessageResIdl);
            if (pushMessageResIdl == null) {
                return;
            }
            this.error = pushMessageResIdl.error;
            this.data = pushMessageResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public PushMessageResIdl build(boolean z) {
            return new PushMessageResIdl(this, z);
        }
    }

    public PushMessageResIdl(Builder builder, boolean z) {
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