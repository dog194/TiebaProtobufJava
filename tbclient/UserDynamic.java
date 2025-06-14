package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class UserDynamic extends Message {
    public static final List<User> DEFAULT_CONCERNED_USER_LIST = Collections.emptyList();

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<User> concerned_user_list;

    public static final class Builder extends Message.Builder<UserDynamic> {
        public List<User> concerned_user_list;

        public Builder() {
        }

        public Builder(UserDynamic userDynamic) {
            super(userDynamic);
            if (userDynamic == null) {
                return;
            }
            this.concerned_user_list = Message.copyOf(userDynamic.concerned_user_list);
        }

        @Override // com.squareup.wire.Message.Builder
        public UserDynamic build(boolean z) {
            return new UserDynamic(this, z);
        }
    }

    public UserDynamic(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<User> list = builder.concerned_user_list;
            if (list == null) {
                this.concerned_user_list = DEFAULT_CONCERNED_USER_LIST;
                return;
            } else {
                this.concerned_user_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.concerned_user_list = Message.immutableCopyOf(builder.concerned_user_list);
    }
}