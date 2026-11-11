package ma.tp19.voiture.services;

import ma.tp19.voiture.entities.Voiture;
import ma.tp19.voiture.repositories.VoitureRepository;
import org.springframework.stereotype.Service;

@Service
public class VoitureService {
    private final VoitureRepository voitureRepository;

    public VoitureService(VoitureRepository voitureRepository) {
        this.voitureRepository = voitureRepository;
    }

    public Voiture enregistrerVoiture(Voiture voiture) {
        return voitureRepository.save(voiture);
    }
}
