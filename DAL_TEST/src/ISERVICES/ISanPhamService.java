package ISERVICES;

import MODELS.SanPham;
import java.util.List;

public interface ISanPhamService {
    public void insert();
    public void update();
    public void delete();
    public List<SanPham> selectAll();
}
