package tbclient.GetOrder;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GetOrderReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<GetOrderReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetOrderReqIdl getOrderReqIdl) {
            super(getOrderReqIdl);
            if (getOrderReqIdl == null) {
                return;
            }
            this.data = getOrderReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetOrderReqIdl build(boolean z) {
            return new GetOrderReqIdl(this, z);
        }
    }

    public GetOrderReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}