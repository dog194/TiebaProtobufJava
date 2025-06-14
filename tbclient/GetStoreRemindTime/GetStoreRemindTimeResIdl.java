package tbclient.GetStoreRemindTime;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetStoreRemindTimeResIdl extends Message {

    @ProtoField(tag = 1)
    public final DataRes data;

    @ProtoField(tag = 2)
    public final Error error;

    public static final class Builder extends Message.Builder<GetStoreRemindTimeResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetStoreRemindTimeResIdl getStoreRemindTimeResIdl) {
            super(getStoreRemindTimeResIdl);
            if (getStoreRemindTimeResIdl == null) {
                return;
            }
            this.data = getStoreRemindTimeResIdl.data;
            this.error = getStoreRemindTimeResIdl.error;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetStoreRemindTimeResIdl build(boolean z) {
            return new GetStoreRemindTimeResIdl(this, z);
        }
    }

    public GetStoreRemindTimeResIdl(Builder builder, boolean z) {
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