package id.co.egifcb.peklatour.peklatour.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DaftarpesananItem(

	@field:SerializedName("no")
	val no: Int? = null,

	@field:SerializedName("jumlah_penumpang")
	val jumlahPenumpang: String? = null,

	@field:SerializedName("id_pemesan")
	val idPemesan: String,

	@field:SerializedName("id_daftar_tour")
	val idDaftarTour: Int? = null,

	@field:SerializedName("tanggal_berangkat")
	val tanggalBerangkat: String? = null,

	@field:SerializedName("tujuan_tour")
	val tujuanTour: String? = null,

	@field:SerializedName("durasi_tour")
	val durasiTour: String? = null,

	@field:SerializedName("status_pesanan")
	val statusPesanan: String? = null,

	@field:SerializedName("biaya_tour")
	val biayaTour: String? = null
) : Parcelable