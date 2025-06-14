package tbclient.ItemManage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class ItemManageResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<ItemManageResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(ItemManageResIdl itemManageResIdl) {
            super(itemManageResIdl);
            if (itemManageResIdl == null) {
                return;
            }
            this.error = itemManageResIdl.error;
            this.data = itemManageResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public ItemManageResIdl build(boolean z) {
            return new ItemManageResIdl(this, z);
        }
    }

    public ItemManageResIdl(Builder builder, boolean z) {
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