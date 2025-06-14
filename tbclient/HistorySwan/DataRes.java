package tbclient.HistorySwan;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.SmartApp;

/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static final List<SmartApp> DEFAULT_NAWS_LIST = Collections.emptyList();

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<SmartApp> naws_list;

    public static final class Builder extends Message.Builder<DataRes> {
        public List<SmartApp> naws_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.naws_list = Message.copyOf(dataRes.naws_list);
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<SmartApp> list = builder.naws_list;
            if (list == null) {
                this.naws_list = DEFAULT_NAWS_LIST;
                return;
            } else {
                this.naws_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.naws_list = Message.immutableCopyOf(builder.naws_list);
    }
}