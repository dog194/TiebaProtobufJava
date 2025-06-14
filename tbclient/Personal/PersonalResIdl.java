package tbclient.Personal;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class PersonalResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<PersonalResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(PersonalResIdl personalResIdl) {
            super(personalResIdl);
            if (personalResIdl == null) {
                return;
            }
            this.error = personalResIdl.error;
            this.data = personalResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public PersonalResIdl build(boolean z) {
            return new PersonalResIdl(this, z);
        }
    }

    public PersonalResIdl(Builder builder, boolean z) {
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