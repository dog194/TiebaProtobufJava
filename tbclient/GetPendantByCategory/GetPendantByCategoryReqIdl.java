package tbclient.GetPendantByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GetPendantByCategoryReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<GetPendantByCategoryReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetPendantByCategoryReqIdl getPendantByCategoryReqIdl) {
            super(getPendantByCategoryReqIdl);
            if (getPendantByCategoryReqIdl == null) {
                return;
            }
            this.data = getPendantByCategoryReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetPendantByCategoryReqIdl build(boolean z) {
            return new GetPendantByCategoryReqIdl(this, z);
        }
    }

    public GetPendantByCategoryReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}