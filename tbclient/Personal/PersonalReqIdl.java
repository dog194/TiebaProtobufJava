package tbclient.Personal;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class PersonalReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<PersonalReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(PersonalReqIdl personalReqIdl) {
            super(personalReqIdl);
            if (personalReqIdl == null) {
                return;
            }
            this.data = personalReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public PersonalReqIdl build(boolean z) {
            return new PersonalReqIdl(this, z);
        }
    }

    public PersonalReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}