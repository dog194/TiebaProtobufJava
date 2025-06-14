package tbclient.AddFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class AddFriendResIdl extends Message {

    @ProtoField(tag = 1)
    public final ResData data;

    @ProtoField(tag = 2)
    public final Error error;

    public static final class Builder extends Message.Builder<AddFriendResIdl> {
        public ResData data;
        public Error error;

        public Builder() {
        }

        public Builder(AddFriendResIdl addFriendResIdl) {
            super(addFriendResIdl);
            if (addFriendResIdl == null) {
                return;
            }
            this.data = addFriendResIdl.data;
            this.error = addFriendResIdl.error;
        }

        @Override // com.squareup.wire.Message.Builder
        public AddFriendResIdl build(boolean z) {
            return new AddFriendResIdl(this, z);
        }
    }

    public AddFriendResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
        } else {
            this.data = builder.data;
            this.error = builder.error;
        }
    }
}