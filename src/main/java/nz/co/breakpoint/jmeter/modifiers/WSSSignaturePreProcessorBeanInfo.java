package nz.co.breakpoint.jmeter.modifiers;

import java.beans.PropertyDescriptor;

public class WSSSignaturePreProcessorBeanInfo extends CryptoWSSecurityPreProcessorBeanInfo {

    public WSSSignaturePreProcessorBeanInfo() {
        super(WSSSignaturePreProcessor.class);

        createPropertyGroup("Signature", new String[]{ 
            "keyIdentifier", "signatureAlgorithm", "signatureCanonicalization", "digestAlgorithm", "useSingleCertificate",
            PARTSTOSECURE // this property is created in the parent class but added here so it is rendered at the bottom
        });
        PropertyDescriptor p;

        p = property("keyIdentifier");
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, WSSSignaturePreProcessor.keyIdentifiers[0]);
        p.setValue(NOT_OTHER, Boolean.TRUE);
        p.setValue(TAGS, WSSSignaturePreProcessor.keyIdentifiers);

        p = property("signatureAlgorithm");
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, WSSSignaturePreProcessor.signatureAlgorithms[0]);
        p.setValue(NOT_OTHER, Boolean.TRUE);
        p.setValue(TAGS, WSSSignaturePreProcessor.signatureAlgorithms);

        p = property("signatureCanonicalization");
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, WSSSignaturePreProcessor.signatureCanonicalizations[0]);
        p.setValue(NOT_OTHER, Boolean.TRUE);
        p.setValue(TAGS, WSSSignaturePreProcessor.signatureCanonicalizations);

        p = property("digestAlgorithm");
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, WSSSignaturePreProcessor.digestAlgorithms[0]);
        p.setValue(NOT_OTHER, Boolean.TRUE);
        p.setValue(TAGS, WSSSignaturePreProcessor.digestAlgorithms);

        p = property("useSingleCertificate");
        p.setValue(NOT_UNDEFINED, Boolean.TRUE);
        p.setValue(DEFAULT, Boolean.FALSE);
    }
}
