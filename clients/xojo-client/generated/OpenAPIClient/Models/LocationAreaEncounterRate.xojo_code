#tag Class
Protected Class LocationAreaEncounterRate

	#tag Property, Flags = &h0
		#tag Note
			The method in which Pokémon may be encountered in an area..
		#tag EndNote
		encounter_method As OpenAPIClient.Models.EncounterMethodSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The chance of the encounter to occur on a version of the game.
		#tag EndNote
		version_details() As OpenAPIClient.Models.LocationAreaEncounterVersionDetail
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
			Name="encounter_method"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="EncounterMethodSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="version_details"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="LocationAreaEncounterVersionDetail"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


