package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GetVipInfoReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<GetVipInfoReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetVipInfoReqIdl getVipInfoReqIdl) {
            super(getVipInfoReqIdl);
            if (getVipInfoReqIdl == null) {
                return;
            }
            this.data = getVipInfoReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetVipInfoReqIdl build(boolean z) {
            return new GetVipInfoReqIdl(this, z);
        }
    }

    public GetVipInfoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}