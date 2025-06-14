package tbclient.RecomVertical;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class RecomVerticalResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<RecomVerticalResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(RecomVerticalResIdl recomVerticalResIdl) {
            super(recomVerticalResIdl);
            if (recomVerticalResIdl == null) {
                return;
            }
            this.error = recomVerticalResIdl.error;
            this.data = recomVerticalResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public RecomVerticalResIdl build(boolean z) {
            return new RecomVerticalResIdl(this, z);
        }
    }

    public RecomVerticalResIdl(Builder builder, boolean z) {
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