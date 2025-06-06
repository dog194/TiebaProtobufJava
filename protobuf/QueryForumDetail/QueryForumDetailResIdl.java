package protobuf.QueryForumDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import protobuf.Error;

/* loaded from: classes4.dex */
public final class QueryForumDetailResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<QueryForumDetailResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(QueryForumDetailResIdl queryForumDetailResIdl) {
            super(queryForumDetailResIdl);
            if (queryForumDetailResIdl == null) {
                return;
            }
            this.error = queryForumDetailResIdl.error;
            this.data = queryForumDetailResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public QueryForumDetailResIdl build(boolean z) {
            return new QueryForumDetailResIdl(this, z);
        }
    }

    public QueryForumDetailResIdl(Builder builder, boolean z) {
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