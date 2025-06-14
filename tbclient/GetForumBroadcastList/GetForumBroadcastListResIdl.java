package tbclient.GetForumBroadcastList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetForumBroadcastListResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<GetForumBroadcastListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetForumBroadcastListResIdl getForumBroadcastListResIdl) {
            super(getForumBroadcastListResIdl);
            if (getForumBroadcastListResIdl == null) {
                return;
            }
            this.error = getForumBroadcastListResIdl.error;
            this.data = getForumBroadcastListResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetForumBroadcastListResIdl build(boolean z) {
            return new GetForumBroadcastListResIdl(this, z);
        }
    }

    public GetForumBroadcastListResIdl(Builder builder, boolean z) {
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