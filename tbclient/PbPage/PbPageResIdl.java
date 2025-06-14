package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class PbPageResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<PbPageResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(PbPageResIdl pbPageResIdl) {
            super(pbPageResIdl);
            if (pbPageResIdl == null) {
                return;
            }
            this.error = pbPageResIdl.error;
            this.data = pbPageResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public PbPageResIdl build(boolean z) {
            return new PbPageResIdl(this, z);
        }
    }

    public PbPageResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
        } else {
            this.error = builder.error;
            this.data = builder.data;
        }
    }
}