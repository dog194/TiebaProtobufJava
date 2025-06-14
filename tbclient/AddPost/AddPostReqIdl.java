package tbclient.AddPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class AddPostReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<AddPostReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(AddPostReqIdl addPostReqIdl) {
            super(addPostReqIdl);
            if (addPostReqIdl == null) {
                return;
            }
            this.data = addPostReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public AddPostReqIdl build(boolean z) {
            return new AddPostReqIdl(this, z);
        }
    }

    public AddPostReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}