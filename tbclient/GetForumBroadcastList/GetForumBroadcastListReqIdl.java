package tbclient.GetForumBroadcastList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GetForumBroadcastListReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<GetForumBroadcastListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetForumBroadcastListReqIdl getForumBroadcastListReqIdl) {
            super(getForumBroadcastListReqIdl);
            if (getForumBroadcastListReqIdl == null) {
                return;
            }
            this.data = getForumBroadcastListReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetForumBroadcastListReqIdl build(boolean z) {
            return new GetForumBroadcastListReqIdl(this, z);
        }
    }

    public GetForumBroadcastListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}