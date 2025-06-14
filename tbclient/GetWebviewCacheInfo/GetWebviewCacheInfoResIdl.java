package tbclient.GetWebviewCacheInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetWebviewCacheInfoResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<GetWebviewCacheInfoResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetWebviewCacheInfoResIdl getWebviewCacheInfoResIdl) {
            super(getWebviewCacheInfoResIdl);
            if (getWebviewCacheInfoResIdl == null) {
                return;
            }
            this.error = getWebviewCacheInfoResIdl.error;
            this.data = getWebviewCacheInfoResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetWebviewCacheInfoResIdl build(boolean z) {
            return new GetWebviewCacheInfoResIdl(this, z);
        }
    }

    public GetWebviewCacheInfoResIdl(Builder builder, boolean z) {
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