package tbclient.UpdateTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class UpdateTailResIdl extends Message {

    @ProtoField(tag = 1)
    public final ResData data;

    @ProtoField(tag = 2)
    public final Error error;

    public static final class Builder extends Message.Builder<UpdateTailResIdl> {
        public ResData data;
        public Error error;

        public Builder() {
        }

        public Builder(UpdateTailResIdl updateTailResIdl) {
            super(updateTailResIdl);
            if (updateTailResIdl == null) {
                return;
            }
            this.data = updateTailResIdl.data;
            this.error = updateTailResIdl.error;
        }

        @Override // com.squareup.wire.Message.Builder
        public UpdateTailResIdl build(boolean z) {
            return new UpdateTailResIdl(this, z);
        }
    }

    public UpdateTailResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
        } else {
            this.data = builder.data;
            this.error = builder.error;
        }
    }
}