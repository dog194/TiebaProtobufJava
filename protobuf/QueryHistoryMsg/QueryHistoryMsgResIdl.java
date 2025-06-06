package protobuf.QueryHistoryMsg;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import protobuf.Error;

/* loaded from: classes4.dex */
public final class QueryHistoryMsgResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<QueryHistoryMsgResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(QueryHistoryMsgResIdl queryHistoryMsgResIdl) {
            super(queryHistoryMsgResIdl);
            if (queryHistoryMsgResIdl == null) {
                return;
            }
            this.error = queryHistoryMsgResIdl.error;
            this.data = queryHistoryMsgResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public QueryHistoryMsgResIdl build(boolean z) {
            return new QueryHistoryMsgResIdl(this, z);
        }
    }

    public QueryHistoryMsgResIdl(Builder builder, boolean z) {
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