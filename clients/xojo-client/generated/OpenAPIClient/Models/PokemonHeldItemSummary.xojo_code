#tag Class
Protected Class PokemonHeldItemSummary

	#tag Property, Flags = &h0
		#tag Note
			The item the referenced Pokémon holds.
		#tag EndNote
		item As OpenAPIClient.Models.ItemSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The details of the different versions in which the item is held.
		#tag EndNote
		version_details() As OpenAPIClient.Models.PokemonHeldItemVersion
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
			Name="item"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="version_details"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonHeldItemVersion"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


