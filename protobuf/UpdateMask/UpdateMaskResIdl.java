package protobuf.UpdateMask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import protobuf.Error;

/* loaded from: classes4.dex */
public final class UpdateMaskResIdl extends Message {

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<UpdateMaskResIdl> {
        public Error error;

        public Builder() {
        }

        public Builder(UpdateMaskResIdl updateMaskResIdl) {
            super(updateMaskResIdl);
            if (updateMaskResIdl == null) {
                return;
            }
            this.error = updateMaskResIdl.error;
        }

        @Override // com.squareup.wire.Message.Builder
        public UpdateMaskResIdl build(boolean z) {
            return new UpdateMaskResIdl(this, z);
        }
    }

    public UpdateMaskResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
        } else {
            this.error = builder.error;
        }
    }
}