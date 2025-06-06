package protobuf.GetLivableForumList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import protobuf.Error;

/* loaded from: classes4.dex */
public final class GetLivableForumListResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<GetLivableForumListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetLivableForumListResIdl getLivableForumListResIdl) {
            super(getLivableForumListResIdl);
            if (getLivableForumListResIdl == null) {
                return;
            }
            this.error = getLivableForumListResIdl.error;
            this.data = getLivableForumListResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetLivableForumListResIdl build(boolean z) {
            return new GetLivableForumListResIdl(this, z);
        }
    }

    public GetLivableForumListResIdl(Builder builder, boolean z) {
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