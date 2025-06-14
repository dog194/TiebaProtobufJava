package tbclient.GetSugTopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GetSugTopicReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<GetSugTopicReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetSugTopicReqIdl getSugTopicReqIdl) {
            super(getSugTopicReqIdl);
            if (getSugTopicReqIdl == null) {
                return;
            }
            this.data = getSugTopicReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetSugTopicReqIdl build(boolean z) {
            return new GetSugTopicReqIdl(this, z);
        }
    }

    public GetSugTopicReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}