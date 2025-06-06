package protobuf.UpdateForumMask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class UpdateForumMaskReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<UpdateForumMaskReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(UpdateForumMaskReqIdl updateForumMaskReqIdl) {
            super(updateForumMaskReqIdl);
            if (updateForumMaskReqIdl == null) {
                return;
            }
            this.data = updateForumMaskReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public UpdateForumMaskReqIdl build(boolean z) {
            return new UpdateForumMaskReqIdl(this, z);
        }
    }

    public UpdateForumMaskReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}