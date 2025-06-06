package protobuf.UpdateMaskInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class UpdateMaskInfoReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<UpdateMaskInfoReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(UpdateMaskInfoReqIdl updateMaskInfoReqIdl) {
            super(updateMaskInfoReqIdl);
            if (updateMaskInfoReqIdl == null) {
                return;
            }
            this.data = updateMaskInfoReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public UpdateMaskInfoReqIdl build(boolean z) {
            return new UpdateMaskInfoReqIdl(this, z);
        }
    }

    public UpdateMaskInfoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}