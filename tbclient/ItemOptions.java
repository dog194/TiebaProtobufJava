package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ItemOptions extends Message {
    public static final String DEFAULT_KEY = "";
    public static final String DEFAULT_VALUE = "";

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String key;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String value;

    public static final class Builder extends Message.Builder<ItemOptions> {
        public String key;
        public String value;

        public Builder() {
        }

        public Builder(ItemOptions itemOptions) {
            super(itemOptions);
            if (itemOptions == null) {
                return;
            }
            this.key = itemOptions.key;
            this.value = itemOptions.value;
        }

        @Override // com.squareup.wire.Message.Builder
        public ItemOptions build(boolean z) {
            return new ItemOptions(this, z);
        }
    }

    public ItemOptions(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.key;
            if (str == null) {
                this.key = "";
            } else {
                this.key = str;
            }
            String str2 = builder.value;
            if (str2 == null) {
                this.value = "";
                return;
            } else {
                this.value = str2;
                return;
            }
        }
        this.key = builder.key;
        this.value = builder.value;
    }
}