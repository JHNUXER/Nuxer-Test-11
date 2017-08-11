public class BasicBlock extends Block {
  public BasicBlock(String txnm) {
    this(txnm,Material.stone);
  }
  
  public BasicBlock(String txnm,float hardness) {
    this(txnm,Material.stone,hardness);
  }
  
  public BasicBlock(String txnm,Material mat) {
    this(txnm,mat,5f);
  }
  
  public BasicBlock(String txnm,Material mat,float hardness) {
    this(txnm,mat,hardness,hardness);
  }
  
  public BasicBlock(String txnm,Material mat,float hardness,float resistance) {
    super(mat);
    setTextureName(txnm);
    setHardness(hardness);
    setResistance(resistance);
  }
  
}
