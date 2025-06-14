package tbclient.CheckRealName;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class CheckRealNameResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<CheckRealNameResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(CheckRealNameResIdl checkRealNameResIdl) {
            super(checkRealNameResIdl);
            if (checkRealNameResIdl == null) {
                return;
            }
            this.error = checkRealNameResIdl.error;
            this.data = checkRealNameResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public CheckRealNameResIdl build(boolean z) {
            return new CheckRealNameResIdl(this, z);
        }
    }

    public CheckRealNameResIdl(Builder builder, boolean z) {
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