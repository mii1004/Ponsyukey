package javajo.ponsyukey.service;

import javajo.ponsyukey.dto.Saketomo;
import javajo.ponsyukey.model.CreateSaketomoRequest;
import javajo.ponsyukey.model.SaketomoRequestResponse;
import javajo.ponsyukey.repository.SaketomoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaketomoService {

    private final SaketomoRepository saketomoRepository;

    @Autowired
    public SaketomoService(SaketomoRepository saketomoRepository) {
        this.saketomoRepository = saketomoRepository;
    }

    /**
     * 指定した会員IDに紐づく会員情報を取得する
     * @param saketomoId 会員ID
     * @return 会員情報一式
     */
    public SaketomoRequestResponse getSaketomoResponse(String saketomoId) {
        // 会員IDに紐づく会員情報を取得する
        return saketomoRepository.getSaketomo(saketomoId);
    }

    /**
     * 新しい会員情報を登録する
     * @param createSaketomoRequest 会員情報一式
     * @return 会員情報一式
     */
    public SaketomoRequestResponse createSaketomo(CreateSaketomoRequest createSaketomoRequest) {
        // TODO repositoryをよぶ
        saketomoRepository.insertSaketomo();

        SaketomoRequestResponse saketomo = new SaketomoRequestResponse();
        // TODO つめる
        return saketomo;
    }
}
