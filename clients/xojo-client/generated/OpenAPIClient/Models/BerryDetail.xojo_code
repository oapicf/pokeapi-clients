#tag Class
Protected Class BerryDetail

	#tag Property, Flags = &h0
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		growth_time As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		max_harvest As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		natural_gift_power As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		size As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		smoothness As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		soil_dryness As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		firmness As OpenAPIClient.Models.BerryFirmnessSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		flavors() As OpenAPIClient.Models.BerryDetailFlavorsInner
	#tag EndProperty


	#tag Property, Flags = &h0
		item As OpenAPIClient.Models.ItemSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		natural_gift_type As OpenAPIClient.Models.TypeSummary
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="growth_time"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="max_harvest"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="natural_gift_power"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="size"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="smoothness"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="soil_dryness"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="firmness"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BerryFirmnessSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="flavors"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BerryDetailFlavorsInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="item"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="natural_gift_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TypeSummary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


