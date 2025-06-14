package tbclient.AgreeMe;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class AgreeMeReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<AgreeMeReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(AgreeMeReqIdl agreeMeReqIdl) {
            super(agreeMeReqIdl);
            if (agreeMeReqIdl == null) {
                return;
            }
            this.data = agreeMeReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public AgreeMeReqIdl build(boolean z) {
            return new AgreeMeReqIdl(this, z);
        }
    }

    public AgreeMeReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}