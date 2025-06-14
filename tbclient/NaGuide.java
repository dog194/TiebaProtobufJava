package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class NaGuide extends Message {
    public static final String DEFAULT_DWNL_URL = "";
    public static final List<RecGuide> DEFAULT_REC_INFO = Collections.emptyList();

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String dwnl_url;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<RecGuide> rec_info;

    public static final class Builder extends Message.Builder<NaGuide> {
        public String dwnl_url;
        public List<RecGuide> rec_info;

        public Builder() {
        }

        public Builder(NaGuide naGuide) {
            super(naGuide);
            if (naGuide == null) {
                return;
            }
            this.dwnl_url = naGuide.dwnl_url;
            this.rec_info = Message.copyOf(naGuide.rec_info);
        }

        @Override // com.squareup.wire.Message.Builder
        public NaGuide build(boolean z) {
            return new NaGuide(this, z);
        }
    }

    public NaGuide(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.dwnl_url;
            if (str == null) {
                this.dwnl_url = "";
            } else {
                this.dwnl_url = str;
            }
            List<RecGuide> list = builder.rec_info;
            if (list == null) {
                this.rec_info = DEFAULT_REC_INFO;
                return;
            } else {
                this.rec_info = Message.immutableCopyOf(list);
                return;
            }
        }
        this.dwnl_url = builder.dwnl_url;
        this.rec_info = Message.immutableCopyOf(builder.rec_info);
    }
}