package tbclient.GetCard;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GetCardReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<GetCardReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetCardReqIdl getCardReqIdl) {
            super(getCardReqIdl);
            if (getCardReqIdl == null) {
                return;
            }
            this.data = getCardReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetCardReqIdl build(boolean z) {
            return new GetCardReqIdl(this, z);
        }
    }

    public GetCardReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}