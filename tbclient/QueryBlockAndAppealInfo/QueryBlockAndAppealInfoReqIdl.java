package tbclient.QueryBlockAndAppealInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class QueryBlockAndAppealInfoReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<QueryBlockAndAppealInfoReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(QueryBlockAndAppealInfoReqIdl queryBlockAndAppealInfoReqIdl) {
            super(queryBlockAndAppealInfoReqIdl);
            if (queryBlockAndAppealInfoReqIdl == null) {
                return;
            }
            this.data = queryBlockAndAppealInfoReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public QueryBlockAndAppealInfoReqIdl build(boolean z) {
            return new QueryBlockAndAppealInfoReqIdl(this, z);
        }
    }

    public QueryBlockAndAppealInfoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}