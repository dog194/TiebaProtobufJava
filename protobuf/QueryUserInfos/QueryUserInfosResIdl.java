package protobuf.QueryUserInfos;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import protobuf.Error;

/* loaded from: classes4.dex */
public final class QueryUserInfosResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<QueryUserInfosResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(QueryUserInfosResIdl queryUserInfosResIdl) {
            super(queryUserInfosResIdl);
            if (queryUserInfosResIdl == null) {
                return;
            }
            this.error = queryUserInfosResIdl.error;
            this.data = queryUserInfosResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public QueryUserInfosResIdl build(boolean z) {
            return new QueryUserInfosResIdl(this, z);
        }
    }

    public QueryUserInfosResIdl(Builder builder, boolean z) {
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