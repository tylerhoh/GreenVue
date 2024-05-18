import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InvestorService {
    @Autowired
    private InvestorRepository investorRepository;

    public List<Investor> getAllInvestors() {
        return investorRepository.findAll();
    }

    public Investor createInvestor(Investor investor) {
        return investorRepository.save(investor);
    }

    // Other CRUD methods
}