import com.example.pathoflight.ApiService_Surahs
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private const val BASE_URL = "http://api.alquran.cloud/v1/surah"

    val api: ApiService_Surahs by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService_Surahs::class.java)
    }
}
