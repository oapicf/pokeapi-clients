//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pokedex_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_dex_entry.g.dart';

/// PokemonDexEntry
///
/// Properties:
/// * [entryNumber] 
/// * [pokedex] 
@BuiltValue()
abstract class PokemonDexEntry implements Built<PokemonDexEntry, PokemonDexEntryBuilder> {
  @BuiltValueField(wireName: r'entry_number')
  int get entryNumber;

  @BuiltValueField(wireName: r'pokedex')
  PokedexSummary get pokedex;

  PokemonDexEntry._();

  factory PokemonDexEntry([void updates(PokemonDexEntryBuilder b)]) = _$PokemonDexEntry;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonDexEntryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonDexEntry> get serializer => _$PokemonDexEntrySerializer();
}

class _$PokemonDexEntrySerializer implements PrimitiveSerializer<PokemonDexEntry> {
  @override
  final Iterable<Type> types = const [PokemonDexEntry, _$PokemonDexEntry];

  @override
  final String wireName = r'PokemonDexEntry';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonDexEntry object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'entry_number';
    yield serializers.serialize(
      object.entryNumber,
      specifiedType: const FullType(int),
    );
    yield r'pokedex';
    yield serializers.serialize(
      object.pokedex,
      specifiedType: const FullType(PokedexSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonDexEntry object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonDexEntryBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'entry_number':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.entryNumber = valueDes;
          break;
        case r'pokedex':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PokedexSummary),
          ) as PokedexSummary;
          result.pokedex.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonDexEntry deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonDexEntryBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

