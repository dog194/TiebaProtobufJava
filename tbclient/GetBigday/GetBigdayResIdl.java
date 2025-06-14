package tbclient.GetBigday;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetBigdayResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<GetBigdayResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetBigdayResIdl getBigdayResIdl) {
            super(getBigdayResIdl);
            if (getBigdayResIdl == null) {
                return;
            }
            this.error = getBigdayResIdl.error;
            this.data = getBigdayResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetBigdayResIdl build(boolean z) {
            return new GetBigdayResIdl(this, z);
        }
    }

    public GetBigdayResIdl(Builder builder, boolean z) {
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