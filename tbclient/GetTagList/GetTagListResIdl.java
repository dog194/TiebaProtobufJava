package tbclient.GetTagList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetTagListResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<GetTagListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetTagListResIdl getTagListResIdl) {
            super(getTagListResIdl);
            if (getTagListResIdl == null) {
                return;
            }
            this.error = getTagListResIdl.error;
            this.data = getTagListResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetTagListResIdl build(boolean z) {
            return new GetTagListResIdl(this, z);
        }
    }

    public GetTagListResIdl(Builder builder, boolean z) {
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