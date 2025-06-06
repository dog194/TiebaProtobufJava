package protobuf.GetMaskInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GetMaskInfoReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<GetMaskInfoReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetMaskInfoReqIdl getMaskInfoReqIdl) {
            super(getMaskInfoReqIdl);
            if (getMaskInfoReqIdl == null) {
                return;
            }
            this.data = getMaskInfoReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetMaskInfoReqIdl build(boolean z) {
            return new GetMaskInfoReqIdl(this, z);
        }
    }

    public GetMaskInfoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}