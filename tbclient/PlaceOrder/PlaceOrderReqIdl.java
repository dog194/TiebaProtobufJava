package tbclient.PlaceOrder;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class PlaceOrderReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<PlaceOrderReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(PlaceOrderReqIdl placeOrderReqIdl) {
            super(placeOrderReqIdl);
            if (placeOrderReqIdl == null) {
                return;
            }
            this.data = placeOrderReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public PlaceOrderReqIdl build(boolean z) {
            return new PlaceOrderReqIdl(this, z);
        }
    }

    public PlaceOrderReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}