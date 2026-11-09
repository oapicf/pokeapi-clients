#tag Class
Protected Class PokemonSpritesOtherOfficialArtwork

	#tag Property, Flags = &h0
		#tag Note
			The URL of the default front official artwork, or null if unavailable.
		#tag EndNote
		front_default As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The URL of the shiny front official artwork, or null if unavailable.
		#tag EndNote
		front_shiny As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Additional official artwork grouped by version. Available keys vary by resource.
		#tag EndNote
		versions As Dictionary
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
			Name="front_default"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="front_shiny"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="versions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Dictionary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


