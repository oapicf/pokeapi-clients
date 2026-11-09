#tag Class
Protected Class BerryDetail

	#tag Property, Flags = &h0
		#tag Note
			The identifier for this resource.
		#tag EndNote
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name for this resource.
		#tag EndNote
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
		#tag EndNote
		growth_time As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The maximum number of these berries that can grow on one tree in Generation IV.
		#tag EndNote
		max_harvest As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The power of the move "Natural Gift" when used with this Berry.
		#tag EndNote
		natural_gift_power As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The size of this Berry, in millimeters.
		#tag EndNote
		size As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The smoothness of this Berry, used in making Pokéblocks or Poffins.
		#tag EndNote
		smoothness As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.
		#tag EndNote
		soil_dryness As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The firmness of this berry, used in making Pokéblocks or Poffins.
		#tag EndNote
		firmness As OpenAPIClient.Models.BerryFirmnessSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.
		#tag EndNote
		flavors() As OpenAPIClient.Models.BerryFlavorMap
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Berries are actually items. This is a reference to the item specific data for this berry.
		#tag EndNote
		item As OpenAPIClient.Models.ItemSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The type inherited by "Natural Gift" when used with this Berry.
		#tag EndNote
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
			Type="BerryFlavorMap"
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


